package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.TextAa: ImageVector
    get() {
        if (_textAa != null) {
            return _textAa!!
        }
        _textAa = Builder(name = "TextAa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 156.0f)
                curveToRelative(0.0f, 6.5f, -7.33f, 12.0f, -16.0f, 12.0f)
                reflectiveCurveToRelative(-16.0f, -5.5f, -16.0f, -12.0f)
                reflectiveCurveToRelative(7.33f, -12.0f, 16.0f, -12.0f)
                reflectiveCurveTo(200.0f, 149.5f, 200.0f, 156.0f)
                close()
                moveTo(232.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(143.37f, 172.88f)
                lineToRelative(-44.0f, -104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.74f, 0.0f)
                lineToRelative(-44.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.74f, 6.24f)
                lineTo(66.84f, 152.0f)
                horizontalLineToRelative(50.32f)
                lineToRelative(11.47f, 27.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.74f, -6.24f)
                close()
                moveTo(216.0f, 124.0f)
                curveToRelative(0.0f, -15.44f, -14.36f, -28.0f, -32.0f, -28.0f)
                arcToRelative(34.86f, 34.86f, 0.0f, false, false, -20.78f, 6.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.56f, 12.83f)
                arcTo(18.84f, 18.84f, 0.0f, false, true, 184.0f, 112.0f)
                curveToRelative(8.56f, 0.0f, 15.8f, 5.36f, 16.0f, 11.76f)
                verticalLineToRelative(8.0f)
                arcTo(35.24f, 35.24f, 0.0f, false, false, 184.0f, 128.0f)
                curveToRelative(-17.64f, 0.0f, -32.0f, 12.56f, -32.0f, 28.0f)
                reflectiveCurveToRelative(14.36f, 28.0f, 32.0f, 28.0f)
                arcToRelative(35.13f, 35.13f, 0.0f, false, false, 16.93f, -4.26f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 176.0f)
                close()
                moveTo(73.61f, 136.0f)
                horizontalLineToRelative(36.78f)
                lineTo(92.0f, 92.53f)
                close()
            }
        }
        .build()
        return _textAa!!
    }

private var _textAa: ImageVector? = null
