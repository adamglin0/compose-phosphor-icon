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

public val DuotoneGroup.`Film-script-duotone`: ImageVector
    get() {
        if (`_film-script-duotone` != null) {
            return `_film-script-duotone`!!
        }
        `_film-script-duotone` = Builder(name = "Film-script-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 40.0f)
                lineTo(200.0f, 40.0f)
                lineTo(200.0f, 216.0f)
                close()
                moveTo(96.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 84.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 80.0f)
                close()
                moveTo(96.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 176.0f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_film-script-duotone`!!
    }

private var `_film-script-duotone`: ImageVector? = null
