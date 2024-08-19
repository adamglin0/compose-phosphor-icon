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

public val LightGroup.`Solar-roof-light`: ImageVector
    get() {
        if (`_solar-roof-light` != null) {
            return `_solar-roof-light`!!
        }
        `_solar-roof-light` = Builder(name = "Solar-roof-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.37f, 125.32f)
                lineToRelative(-40.0f, -80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 42.0f)
                lineTo(56.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.37f, 3.32f)
                lineToRelative(-40.0f, 80.0f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 10.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(232.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(246.0f, 128.0f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 245.37f, 125.32f)
                close()
                moveTo(99.71f, 122.0f)
                lineToRelative(-14.0f, -28.0f)
                horizontalLineToRelative(34.58f)
                lineToRelative(14.0f, 28.0f)
                close()
                moveTo(100.29f, 54.0f)
                lineTo(114.29f, 82.0f)
                lineTo(79.71f, 82.0f)
                lineToRelative(-14.0f, -28.0f)
                close()
                moveTo(148.29f, 54.0f)
                lineTo(162.29f, 82.0f)
                lineTo(127.71f, 82.0f)
                lineToRelative(-14.0f, -28.0f)
                close()
                moveTo(147.71f, 122.0f)
                lineTo(133.71f, 94.0f)
                horizontalLineToRelative(34.58f)
                lineToRelative(14.0f, 28.0f)
                close()
                moveTo(195.71f, 122.0f)
                lineTo(181.71f, 94.0f)
                horizontalLineToRelative(34.58f)
                lineToRelative(14.0f, 28.0f)
                close()
                moveTo(210.29f, 82.0f)
                lineTo(175.71f, 82.0f)
                lineToRelative(-14.0f, -28.0f)
                horizontalLineToRelative(34.58f)
                close()
                moveTo(22.0f, 184.0f)
                lineTo(22.0f, 129.42f)
                lineToRelative(34.0f, -68.0f)
                lineToRelative(34.0f, 68.0f)
                lineTo(90.0f, 186.0f)
                lineTo(24.0f, 186.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 184.0f)
                close()
                moveTo(232.0f, 186.0f)
                lineTo(102.0f, 186.0f)
                lineTo(102.0f, 134.0f)
                lineTo(234.0f, 134.0f)
                verticalLineToRelative(50.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 232.0f, 186.0f)
                close()
            }
        }
        .build()
        return `_solar-roof-light`!!
    }

private var `_solar-roof-light`: ImageVector? = null
