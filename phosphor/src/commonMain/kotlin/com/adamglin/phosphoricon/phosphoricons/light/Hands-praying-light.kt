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

public val LightGroup.`Hands-praying-light`: ImageVector
    get() {
        if (`_hands-praying-light` != null) {
            return `_hands-praying-light`!!
        }
        `_hands-praying-light` = Builder(name = "Hands-praying-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.9f, 181.42f)
                lineToRelative(-36.59f, -36.6f)
                lineTo(160.71f, 24.0f)
                arcTo(19.75f, 19.75f, 0.0f, false, false, 128.0f, 15.62f)
                arcTo(19.75f, 19.75f, 0.0f, false, false, 95.29f, 24.0f)
                lineTo(58.69f, 144.82f)
                lineTo(22.1f, 181.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.79f)
                lineTo(54.79f, 233.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.79f, 0.0f)
                lineToRelative(48.29f, -48.28f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 5.13f, -6.38f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 5.13f, 6.38f)
                lineToRelative(48.29f, 48.28f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.79f, 0.0f)
                lineToRelative(32.69f, -32.69f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.79f)
                close()
                moveTo(66.1f, 225.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineTo(30.58f, 192.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineToRelative(14.11f, -14.1f)
                lineTo(80.2f, 211.31f)
                close()
                moveTo(114.38f, 177.13f)
                lineTo(88.69f, 202.83f)
                lineTo(53.17f, 167.31f)
                lineToRelative(15.07f, -15.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.5f, -2.5f)
                lineToRelative(37.0f, -122.22f)
                arcTo(7.78f, 7.78f, 0.0f, false, true, 122.0f, 29.78f)
                verticalLineToRelative(129.0f)
                arcTo(25.83f, 25.83f, 0.0f, false, true, 114.38f, 177.13f)
                close()
                moveTo(134.0f, 158.75f)
                verticalLineToRelative(-129.0f)
                arcToRelative(7.78f, 7.78f, 0.0f, false, true, 15.22f, -2.26f)
                lineToRelative(37.0f, 122.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.5f, 2.5f)
                lineToRelative(15.93f, 15.94f)
                lineToRelative(-36.28f, 34.74f)
                lineToRelative(-25.79f, -25.79f)
                arcTo(25.83f, 25.83f, 0.0f, false, true, 134.0f, 158.75f)
                close()
                moveTo(225.42f, 192.75f)
                lineTo(192.73f, 225.44f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineToRelative(-14.0f, -14.0f)
                lineToRelative(36.29f, -34.74f)
                lineToRelative(13.24f, 13.23f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 225.42f, 192.73f)
                close()
            }
        }
        .build()
        return `_hands-praying-light`!!
    }

private var `_hands-praying-light`: ImageVector? = null
