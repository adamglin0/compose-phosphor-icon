package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) {
            return _nyTimesLogo!!
        }
        _nyTimesLogo = Builder(name = "NyTimesLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 148.0f)
                close()
                moveTo(188.0f, 108.0f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, true, -5.07f, -1.13f)
                lineTo(118.25f, 76.69f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -57.83f, 59.89f)
                lineToRelative(65.93f, -35.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 112.0f)
                verticalLineToRelative(98.11f)
                arcToRelative(67.71f, 67.71f, 0.0f, false, false, 44.75f, -35.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 21.42f, 10.82f)
                arcToRelative(91.54f, 91.54f, 0.0f, false, true, -76.0f, 50.38f)
                arcTo(12.13f, 12.13f, 0.0f, false, true, 132.0f, 236.0f)
                curveToRelative(-0.35f, 0.0f, -0.68f, 0.0f, -1.0f, -0.05f)
                curveToRelative(-1.0f, 0.0f, -2.0f, 0.05f, -3.0f, 0.05f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 46.36f, 101.61f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 68.0f, 28.0f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, true, 5.07f, 1.13f)
                lineToRelative(117.24f, 54.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 188.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f)
                close()
                moveTo(80.0f, 192.12f)
                lineTo(80.0f, 153.33f)
                lineToRelative(-17.39f, 9.28f)
                arcTo(68.13f, 68.13f, 0.0f, false, false, 80.0f, 192.12f)
                close()
                moveTo(120.0f, 132.0f)
                lineToRelative(-16.0f, 8.53f)
                verticalLineToRelative(67.08f)
                arcToRelative(67.1f, 67.1f, 0.0f, false, false, 16.0f, 3.9f)
                close()
                moveTo(86.5f, 61.88f)
                lineTo(65.69f, 52.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.58f, 29.74f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 86.5f, 61.88f)
                close()
            }
        }
        .build()
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
