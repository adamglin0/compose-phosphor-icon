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

public val LightGroup.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) {
            return _flagPennant!!
        }
        _flagPennant = Builder(name = "FlagPennant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.0f, 98.33f)
                lineToRelative(-184.0f, -64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 50.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(172.27f)
                lineToRelative(180.0f, -62.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -11.34f)
                close()
                moveTo(62.0f, 159.56f)
                verticalLineTo(48.44f)
                lineTo(221.74f, 104.0f)
                close()
            }
        }
        .build()
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
