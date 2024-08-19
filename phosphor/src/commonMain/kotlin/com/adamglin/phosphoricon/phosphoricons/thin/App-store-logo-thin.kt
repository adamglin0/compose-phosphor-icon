package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`App-store-logo-thin`: ImageVector
    get() {
        if (`_app-store-logo-thin` != null) {
            return `_app-store-logo-thin`!!
        }
        `_app-store-logo-thin` = Builder(name = "App-store-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.9f, 194.0f)
                lineToRelative(-9.46f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 44.56f, 206.0f)
                lineTo(54.0f, 190.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 60.9f, 194.0f)
                close()
                moveTo(232.0f, 156.0f)
                lineTo(181.92f, 156.0f)
                lineTo(150.0f, 102.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.89f, 4.07f)
                lineTo(204.56f, 210.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.88f, -4.07f)
                lineToRelative(-24.79f, -42.0f)
                lineTo(232.0f, 163.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(142.47f, 156.0f)
                lineTo(83.37f, 156.0f)
                lineTo(155.44f, 34.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 148.56f, 30.0f)
                lineTo(128.0f, 64.75f)
                lineTo(107.44f, 30.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 100.56f, 34.0f)
                lineToRelative(22.79f, 38.58f)
                lineTo(74.08f, 156.0f)
                lineTo(24.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(142.47f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return `_app-store-logo-thin`!!
    }

private var `_app-store-logo-thin`: ImageVector? = null
