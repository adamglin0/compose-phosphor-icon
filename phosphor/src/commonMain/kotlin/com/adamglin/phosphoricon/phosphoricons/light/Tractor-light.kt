package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Tractor-light`: ImageVector
    get() {
        if (`_tractor-light` != null) {
            return `_tractor-light`!!
        }
        `_tractor-light` = Builder(name = "Tractor-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 166.12f)
                lineTo(238.0f, 134.0f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, -10.0f, -13.41f)
                lineToRelative(-0.15f, 0.0f)
                lineTo(190.0f, 110.24f)
                lineTo(190.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(35.0f)
                lineToRelative(-28.0f, -7.58f)
                lineTo(150.0f, 54.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 54.0f)
                lineTo(50.0f, 90.0f)
                lineTo(40.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(68.0f, 102.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, true, 70.0f, 70.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(34.06f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 238.0f, 166.12f)
                close()
                moveTo(68.0f, 90.0f)
                lineTo(62.0f, 90.0f)
                lineTo(62.0f, 54.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(75.34f)
                arcTo(82.0f, 82.0f, 0.0f, false, false, 68.0f, 90.0f)
                close()
                moveTo(150.0f, 172.0f)
                lineTo(150.0f, 111.84f)
                lineToRelative(74.63f, 20.21f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 226.0f, 134.0f)
                lineTo(226.0f, 157.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -46.5f, 21.0f)
                lineTo(150.0f, 178.0f)
                close()
                moveTo(212.0f, 210.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 212.0f, 210.0f)
                close()
                moveTo(68.0f, 122.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, false, 50.0f, 50.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, false, 68.0f, 122.0f)
                close()
                moveTo(68.0f, 210.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 38.0f, -38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 68.0f, 210.0f)
                close()
                moveTo(78.0f, 172.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 78.0f, 172.0f)
                close()
            }
        }
        .build()
        return `_tractor-light`!!
    }

private var `_tractor-light`: ImageVector? = null
