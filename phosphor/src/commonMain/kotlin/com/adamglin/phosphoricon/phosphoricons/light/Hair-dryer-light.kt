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

public val LightGroup.`Hair-dryer-light`: ImageVector
    get() {
        if (`_hair-dryer-light` != null) {
            return `_hair-dryer-light`!!
        }
        `_hair-dryer-light` = Builder(name = "Hair-dryer-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 88.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 198.0f, 88.0f)
                close()
                moveTo(168.0f, 106.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 168.0f, 106.0f)
                close()
                moveTo(162.85f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.74f, -8.21f)
                lineToRelative(31.8f, -69.94f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 168.0f, 26.0f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, false, -1.0f, 0.08f)
                lineTo(29.7f, 49.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 62.78f)
                verticalLineToRelative(50.44f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 29.7f, 127.0f)
                lineTo(130.0f, 143.75f)
                lineTo(130.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(184.0f, 242.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(30.0f, 113.22f)
                lineTo(30.0f, 62.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.67f, -2.0f)
                lineTo(168.48f, 38.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, 100.0f)
                lineTo(31.67f, 115.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 113.22f)
                close()
                moveTo(142.0f, 200.0f)
                lineTo(142.0f, 145.75f)
                lineToRelative(25.0f, 4.17f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, false, 1.0f, 0.08f)
                arcToRelative(61.75f, 61.75f, 0.0f, false, false, 21.53f, -3.86f)
                lineToRelative(-24.86f, 54.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.82f, 1.17f)
                lineTo(144.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 142.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_hair-dryer-light`!!
    }

private var `_hair-dryer-light`: ImageVector? = null
