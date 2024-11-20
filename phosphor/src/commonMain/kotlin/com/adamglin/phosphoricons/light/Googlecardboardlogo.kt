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

public val LightGroup.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) {
            return _googleCardboardLogo!!
        }
        _googleCardboardLogo = Builder(name = "GoogleCardboardLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 64.0f)
                lineTo(18.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(96.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f)
                lineToRelative(26.35f, -26.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f)
                lineToRelative(26.35f, 26.34f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 206.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(226.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(162.49f, 194.0f)
                lineTo(137.9f, 169.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(93.51f, 194.0f)
                lineTo(32.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(224.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(80.0f, 98.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 80.0f, 98.0f)
                close()
                moveTo(80.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 80.0f, 146.0f)
                close()
                moveTo(176.0f, 98.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 176.0f, 98.0f)
                close()
                moveTo(176.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 176.0f, 146.0f)
                close()
            }
        }
        .build()
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
