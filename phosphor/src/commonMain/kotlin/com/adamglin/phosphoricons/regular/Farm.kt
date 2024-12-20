package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.83f, 220.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.09f, 2.23f)
                arcTo(183.15f, 183.15f, 0.0f, false, false, 24.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(199.11f, 199.11f, 0.0f, false, true, 110.6f, 33.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.83f, 220.43f)
                close()
                moveTo(24.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(214.81f, 214.81f, 0.0f, false, true, 151.17f, 61.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.2f, -11.42f)
                arcTo(230.69f, 230.69f, 0.0f, false, false, 24.0f, 144.0f)
                close()
                moveTo(232.0f, 160.0f)
                arcToRelative(216.51f, 216.51f, 0.0f, false, false, -48.59f, 5.49f)
                quadToRelative(8.24f, 6.25f, 16.0f, 13.16f)
                arcTo(201.53f, 201.53f, 0.0f, false, true, 232.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                curveToRelative(-6.0f, 0.0f, -11.93f, 0.29f, -17.85f, 0.86f)
                quadToRelative(8.32f, 8.67f, 15.94f, 18.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.48f, 10.0f)
                arcTo(247.0f, 247.0f, 0.0f, false, false, 24.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(266.33f, 266.33f, 0.0f, false, true, 48.0f, 4.37f)
                lineTo(72.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.2f, -6.4f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, 0.0f)
                lineToRelative(64.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 80.0f)
                verticalLineToRelative(32.49f)
                curveToRelative(5.31f, -0.31f, 10.64f, -0.49f, 16.0f, -0.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                arcToRelative(246.3f, 246.3f, 0.0f, false, false, -84.26f, 14.69f)
                quadToRelative(9.44f, 5.0f, 18.46f, 10.78f)
                arcTo(232.2f, 232.2f, 0.0f, false, true, 232.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(120.0f, 88.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(21.94f)
                quadToRelative(11.88f, -2.56f, 24.0f, -4.0f)
                lineTo(200.0f, 84.0f)
                lineTo(144.0f, 42.0f)
                lineTo(88.0f, 84.0f)
                verticalLineToRelative(35.81f)
                quadToRelative(12.19f, 3.0f, 24.0f, 7.18f)
                lineTo(112.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 88.0f)
                close()
                moveTo(128.07f, 133.27f)
                arcTo(262.48f, 262.48f, 0.0f, false, true, 160.0f, 121.94f)
                lineTo(160.0f, 104.0f)
                lineTo(128.0f, 104.0f)
                verticalLineToRelative(29.24f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
