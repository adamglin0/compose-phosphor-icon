package com.adamglin.phosphoricons.duotone

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
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) {
            return _textStrikethrough!!
        }
        _textStrikethrough = Builder(name = "TextStrikethrough", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 72.0f)
                lineToRelative(-55.31f, 51.05f)
                curveToRelative(-24.0f, -6.7f, -45.58f, -14.26f, -45.58f, -35.0f)
                curveToRelative(0.0f, -22.09f, 22.0f, -40.0f, 52.89f, -40.0f)
                curveTo(151.2f, 48.0f, 168.37f, 57.64f, 176.0f, 72.0f)
                close()
                moveTo(120.69f, 123.05f)
                lineTo(72.0f, 168.0f)
                curveToRelative(0.0f, 22.09f, 25.07f, 40.0f, 56.0f, 40.0f)
                reflectiveCurveToRelative(56.0f, -17.91f, 56.0f, -40.0f)
                curveTo(184.0f, 138.43f, 150.52f, 131.4f, 120.69f, 123.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(175.93f)
                curveToRelative(9.19f, 7.11f, 16.07f, 17.2f, 16.07f, 32.0f)
                curveToRelative(0.0f, 13.34f, -7.0f, 25.7f, -19.75f, 34.79f)
                curveTo(160.33f, 211.31f, 144.61f, 216.0f, 128.0f, 216.0f)
                reflectiveCurveToRelative(-32.33f, -4.69f, -44.25f, -13.21f)
                curveTo(71.0f, 193.7f, 64.0f, 181.34f, 64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                curveToRelative(0.0f, 17.35f, 22.0f, 32.0f, 48.0f, 32.0f)
                reflectiveCurveToRelative(48.0f, -14.65f, 48.0f, -32.0f)
                curveToRelative(0.0f, -14.85f, -10.54f, -23.58f, -38.77f, -32.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
                moveTo(76.33f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.61f, -10.49f)
                arcTo(17.3f, 17.3f, 0.0f, false, true, 83.11f, 88.0f)
                curveToRelative(0.0f, -18.24f, 19.3f, -32.0f, 44.89f, -32.0f)
                curveToRelative(18.84f, 0.0f, 34.16f, 7.42f, 41.0f, 19.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.0f, -7.7f)
                curveTo(173.33f, 50.52f, 152.77f, 40.0f, 128.0f, 40.0f)
                curveTo(93.29f, 40.0f, 67.11f, 60.63f, 67.11f, 88.0f)
                arcToRelative(33.73f, 33.73f, 0.0f, false, false, 1.62f, 10.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 76.33f, 104.0f)
                close()
            }
        }
        .build()
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
