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

public val BoldGroup.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) {
            return _googleCardboardLogo!!
        }
        _googleCardboardLogo = Builder(name = "GoogleCardboardLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f)
                lineTo(128.0f, 185.0f)
                lineToRelative(23.51f, 23.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 212.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(220.0f, 188.0f)
                lineTo(165.0f, 188.0f)
                lineToRelative(-22.83f, -22.83f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(91.0f, 188.0f)
                lineTo(36.0f, 188.0f)
                lineTo(36.0f, 68.0f)
                lineTo(220.0f, 68.0f)
                close()
                moveTo(82.0f, 160.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 82.0f, 160.0f)
                close()
                moveTo(82.0f, 116.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 82.0f, 116.0f)
                close()
                moveTo(174.0f, 160.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 174.0f, 160.0f)
                close()
                moveTo(174.0f, 116.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 116.0f)
                close()
            }
        }
        .build()
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
