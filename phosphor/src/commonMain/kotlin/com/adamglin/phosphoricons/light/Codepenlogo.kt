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

public val LightGroup.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) {
            return _codepenLogo!!
        }
        _codepenLogo = Builder(name = "CodepenLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.85f, 90.72f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-104.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.68f, 0.0f)
                lineToRelative(-104.0f, 56.0f)
                horizontalLineToRelative(0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.15f, 5.28f)
                horizontalLineToRelative(0.0f)
                lineToRelative(104.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.68f, 0.0f)
                lineToRelative(104.0f, -56.0f)
                horizontalLineToRelative(0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 238.0f, 160.0f)
                lineTo(238.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 234.85f, 90.72f)
                close()
                moveTo(226.0f, 150.0f)
                lineTo(185.23f, 128.0f)
                lineToRelative(40.77f, -22.0f)
                close()
                moveTo(172.57f, 121.23f)
                lineTo(134.0f, 100.42f)
                lineTo(134.0f, 50.0f)
                lineToRelative(85.34f, 46.0f)
                close()
                moveTo(128.0f, 145.23f)
                lineTo(96.08f, 128.0f)
                lineTo(128.0f, 110.81f)
                lineTo(159.92f, 128.0f)
                close()
                moveTo(122.0f, 50.0f)
                verticalLineToRelative(50.38f)
                lineTo(83.43f, 121.18f)
                lineTo(36.66f, 96.0f)
                close()
                moveTo(30.0f, 106.0f)
                lineTo(70.77f, 128.0f)
                lineTo(30.0f, 150.0f)
                close()
                moveTo(83.43f, 134.76f)
                lineTo(122.0f, 155.58f)
                lineTo(122.0f, 206.0f)
                lineTo(36.66f, 160.0f)
                close()
                moveTo(134.0f, 206.0f)
                lineTo(134.0f, 155.58f)
                lineToRelative(38.57f, -20.77f)
                lineTo(219.34f, 160.0f)
                close()
            }
        }
        .build()
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
