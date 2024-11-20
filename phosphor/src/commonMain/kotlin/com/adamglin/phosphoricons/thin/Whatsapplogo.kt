package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) {
            return _whatsappLogo!!
        }
        _whatsappLogo = Builder(name = "WhatsappLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.79f, 148.42f)
                lineToRelative(-32.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 0.25f)
                lineToRelative(-16.64f, 11.1f)
                arcToRelative(44.56f, 44.56f, 0.0f, false, true, -20.91f, -20.91f)
                lineToRelative(11.1f, -16.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.25f, -4.0f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 185.79f, 148.42f)
                close()
                moveTo(152.0f, 180.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.58f, -27.9f)
                lineToRelative(13.8f, 27.61f)
                lineToRelative(-11.0f, 16.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 124.0f)
                arcToRelative(52.43f, 52.43f, 0.0f, false, false, 28.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, -0.37f)
                lineToRelative(16.54f, -11.0f)
                lineToRelative(27.61f, 13.8f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 152.0f, 180.0f)
                close()
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 40.53f, 176.5f)
                lineToRelative(-11.9f, 35.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.18f, 15.18f)
                lineToRelative(35.69f, -11.9f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -46.07f, -12.35f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, -2.0f, -0.54f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, -1.27f, 0.21f)
                lineTo(41.28f, 219.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.06f, -5.06f)
                lineToRelative(12.46f, -37.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.33f, -3.27f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
