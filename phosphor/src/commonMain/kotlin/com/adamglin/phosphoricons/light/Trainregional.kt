package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) {
            return _trainRegional!!
        }
        _trainRegional = Builder(name = "TrainRegional", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.79f, 118.42f)
                lineTo(199.4f, 36.32f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 185.89f, 26.0f)
                lineTo(70.11f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.6f, 36.32f)
                lineToRelative(-22.39f, 82.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 3.16f)
                lineToRelative(22.39f, 82.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 70.11f, 214.0f)
                lineTo(84.0f, 214.0f)
                lineTo(67.2f, 236.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.6f, 7.2f)
                lineTo(99.0f, 214.0f)
                horizontalLineToRelative(58.0f)
                lineToRelative(22.2f, 29.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, -7.2f)
                lineTo(172.0f, 214.0f)
                horizontalLineToRelative(13.89f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.51f, -10.32f)
                lineToRelative(22.39f, -82.1f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 221.79f, 118.42f)
                close()
                moveTo(68.18f, 39.47f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 70.11f, 38.0f)
                lineTo(185.89f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.93f, 1.47f)
                lineToRelative(20.67f, 75.8f)
                lineTo(128.0f, 129.9f)
                lineTo(47.51f, 115.27f)
                close()
                moveTo(68.18f, 200.53f)
                lineTo(48.29f, 127.61f)
                lineTo(122.0f, 141.0f)
                verticalLineToRelative(61.0f)
                lineTo(70.11f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 68.18f, 200.53f)
                close()
                moveTo(187.82f, 200.53f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.93f, 1.47f)
                lineTo(134.0f, 202.0f)
                lineTo(134.0f, 141.0f)
                lineToRelative(73.71f, -13.4f)
                close()
                moveTo(90.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 94.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 88.0f)
                close()
            }
        }
        .build()
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
