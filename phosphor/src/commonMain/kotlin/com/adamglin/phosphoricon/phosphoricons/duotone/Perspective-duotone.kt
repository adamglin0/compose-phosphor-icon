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

public val DuotoneGroup.`Perspective-duotone`: ImageVector
    get() {
        if (`_perspective-duotone` != null) {
            return `_perspective-duotone`!!
        }
        `_perspective-duotone` = Builder(name = "Perspective-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.43f, 7.87f)
                lineToRelative(-160.0f, -29.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 178.91f)
                verticalLineTo(77.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.57f, -7.87f)
                lineToRelative(160.0f, -29.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 120.0f)
                horizontalLineTo(224.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.86f, -15.74f)
                lineToRelative(-160.0f, 29.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 77.09f)
                verticalLineTo(120.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(42.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.14f, 15.74f)
                lineToRelative(160.0f, 29.09f)
                arcTo(16.47f, 16.47f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(136.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(48.0f, 77.09f)
                lineTo(208.0f, 48.0f)
                verticalLineToRelative(72.0f)
                horizontalLineTo(48.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 178.91f)
                verticalLineTo(136.0f)
                horizontalLineTo(208.0f)
                close()
            }
        }
        .build()
        return `_perspective-duotone`!!
    }

private var `_perspective-duotone`: ImageVector? = null
