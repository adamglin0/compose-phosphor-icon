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

public val DuotoneGroup.`File-c-duotone`: ImageVector
    get() {
        if (`_file-c-duotone` != null) {
            return `_file-c-duotone`!!
        }
        `_file-c-duotone` = Builder(name = "File-c-duotone", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                horizontalLineTo(152.0f)
                verticalLineTo(32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 180.0f)
                curveToRelative(0.0f, 11.0f, 7.18f, 20.0f, 16.0f, 20.0f)
                arcToRelative(14.18f, 14.18f, 0.0f, false, false, 10.22f, -4.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 85.78f, 206.4f)
                arcTo(30.06f, 30.06f, 0.0f, false, true, 64.0f, 216.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f)
                reflectiveCurveToRelative(14.35f, -36.0f, 32.0f, -36.0f)
                arcToRelative(30.06f, 30.06f, 0.0f, false, true, 21.78f, 9.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.56f, 11.06f)
                arcTo(14.18f, 14.18f, 0.0f, false, false, 64.0f, 160.0f)
                curveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f)
                close()
                moveTo(216.0f, 88.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(120.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                lineTo(200.0f, 96.0f)
                lineTo(152.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(144.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                close()
                moveTo(160.0f, 80.0f)
                horizontalLineToRelative(28.69f)
                lineTo(160.0f, 51.31f)
                close()
            }
        }
        .build()
        return `_file-c-duotone`!!
    }

private var `_file-c-duotone`: ImageVector? = null
