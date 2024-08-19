package com.adamglin.phosphoricon.phosphoricons.duotone

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
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Scooter-duotone`: ImageVector
    get() {
        if (`_scooter-duotone` != null) {
            return `_scooter-duotone`!!
        }
        `_scooter-duotone` = Builder(name = "Scooter-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(72.0f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 72.0f, 172.0f)
                close()
                moveTo(212.0f, 144.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 212.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 136.0f)
                curveToRelative(-1.18f, 0.0f, -2.35f, 0.06f, -3.51f, 0.17f)
                lineToRelative(-32.9f, -98.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 32.0f)
                lineTo(136.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(26.23f)
                lineToRelative(17.44f, 52.31f)
                lineTo(124.21f, 168.0f)
                lineTo(79.77f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -1.83f, 16.0f)
                lineTo(128.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.19f, -2.93f)
                lineToRelative(51.46f, -62.81f)
                lineToRelative(7.66f, 23.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 212.0f, 136.0f)
                close()
                moveTo(44.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 192.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 192.0f)
                close()
            }
        }
        .build()
        return `_scooter-duotone`!!
    }

private var `_scooter-duotone`: ImageVector? = null
