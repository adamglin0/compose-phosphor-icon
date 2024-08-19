package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Placeholder-duotone`: ImageVector
    get() {
        if (`_placeholder-duotone` != null) {
            return `_placeholder-duotone`!!
        }
        `_placeholder-duotone` = Builder(name = "Placeholder-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, -10.66f, 4.1f)
                arcToRelative(9.08f, 9.08f, 0.0f, false, false, -1.24f, 1.24f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, 10.66f, -4.1f)
                arcToRelative(7.35f, 7.35f, 0.0f, false, false, 0.65f, -0.59f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.58f, -0.65f)
                arcTo(15.87f, 15.87f, 0.0f, false, false, 224.0f, 208.0f)
                close()
                moveTo(208.0f, 196.7f)
                lineTo(59.31f, 48.0f)
                horizontalLineTo(208.0f)
                close()
                moveTo(48.0f, 59.31f)
                lineTo(196.69f, 208.0f)
                horizontalLineTo(48.0f)
                close()
            }
        }
        .build()
        return `_placeholder-duotone`!!
    }

private var `_placeholder-duotone`: ImageVector? = null
