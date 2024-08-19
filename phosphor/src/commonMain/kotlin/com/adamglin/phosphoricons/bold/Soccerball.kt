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

public val BoldGroup.Soccerball: ImageVector
    get() {
        if (_soccerball != null) {
            return _soccerball!!
        }
        _soccerball = Builder(name = "Soccerball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(199.88f, 171.42f)
                horizontalLineToRelative(-24.0f)
                lineTo(166.1f, 158.0f)
                lineToRelative(11.3f, -32.94f)
                lineTo(193.15f, 120.0f)
                lineToRelative(18.6f, 14.26f)
                arcTo(83.42f, 83.42f, 0.0f, false, true, 199.88f, 171.42f)
                close()
                moveTo(44.25f, 134.21f)
                lineTo(62.85f, 120.0f)
                lineToRelative(15.75f, 5.11f)
                lineTo(89.9f, 158.0f)
                lineToRelative(-9.75f, 13.42f)
                horizontalLineToRelative(-24.0f)
                arcTo(83.42f, 83.42f, 0.0f, false, true, 44.25f, 134.21f)
                close()
                moveTo(111.85f, 148.0f)
                lineToRelative(-9.54f, -27.77f)
                lineTo(128.0f, 102.56f)
                lineToRelative(25.69f, 17.67f)
                lineTo(144.15f, 148.0f)
                close()
                moveTo(192.51f, 74.27f)
                lineTo(185.73f, 97.12f)
                lineTo(169.92f, 102.26f)
                lineTo(140.0f, 81.69f)
                lineTo(140.0f, 65.46f)
                lineToRelative(21.22f, -14.59f)
                arcTo(84.27f, 84.27f, 0.0f, false, true, 192.51f, 74.27f)
                close()
                moveTo(94.78f, 50.87f)
                lineTo(116.0f, 65.46f)
                lineTo(116.0f, 81.69f)
                lineTo(86.08f, 102.26f)
                lineTo(70.27f, 97.12f)
                lineTo(63.49f, 74.27f)
                arcTo(84.27f, 84.27f, 0.0f, false, true, 94.78f, 50.87f)
                close()
                moveTo(108.36f, 209.66f)
                lineTo(99.74f, 185.29f)
                lineTo(109.39f, 172.0f)
                horizontalLineToRelative(37.22f)
                lineToRelative(9.65f, 13.29f)
                lineToRelative(-8.62f, 24.37f)
                arcToRelative(83.59f, 83.59f, 0.0f, false, true, -39.28f, 0.0f)
                close()
            }
        }
        .build()
        return _soccerball!!
    }

private var _soccerball: ImageVector? = null
