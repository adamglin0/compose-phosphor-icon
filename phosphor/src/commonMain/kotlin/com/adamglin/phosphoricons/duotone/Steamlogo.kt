package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.SteamLogo: ImageVector
    get() {
        if (_steamLogo != null) {
            return _steamLogo!!
        }
        _steamLogo = Builder(name = "SteamLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
                moveTo(173.81f, 129.61f)
                lineTo(112.72f, 179.43f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.15f, -28.15f)
                lineToRelative(49.82f, -61.09f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 39.42f, 39.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(117.39f, 185.92f)
                lineToRelative(62.0f, -50.55f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -51.14f, -50.23f)
                lineToRelative(-43.0f, 52.73f)
                lineTo(45.28f, 98.0f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 40.0f, 128.0f)
                arcToRelative(89.56f, 89.56f, 0.0f, false, true, 0.8f, -11.88f)
                lineToRelative(34.57f, 34.57f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 42.0f, 35.23f)
                close()
                moveTo(121.58f, 118.55f)
                arcToRelative(36.18f, 36.18f, 0.0f, false, false, 23.87f, 23.87f)
                lineToRelative(-18.26f, 14.89f)
                arcToRelative(28.11f, 28.11f, 0.0f, false, false, -20.5f, -20.5f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 156.0f, 128.0f)
                close()
                moveTo(100.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 152.0f)
                close()
            }
        }
        .build()
        return _steamLogo!!
    }

private var _steamLogo: ImageVector? = null
