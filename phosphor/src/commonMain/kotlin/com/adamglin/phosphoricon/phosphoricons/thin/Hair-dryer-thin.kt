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

public val ThinGroup.`Hair-dryer-thin`: ImageVector
    get() {
        if (`_hair-dryer-thin` != null) {
            return `_hair-dryer-thin`!!
        }
        `_hair-dryer-thin` = Builder(name = "Hair-dryer-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 88.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 196.0f, 88.0f)
                close()
                moveTo(168.0f, 108.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 168.0f, 108.0f)
                close()
                moveTo(162.85f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.92f, -7.0f)
                lineToRelative(32.0f, -70.39f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 168.0f, 28.0f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, -0.66f, 0.05f)
                lineTo(30.0f, 50.94f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 62.78f)
                verticalLineToRelative(50.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, 11.84f)
                lineToRelative(102.0f, 17.0f)
                lineTo(132.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(184.0f, 244.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(28.0f, 113.22f)
                lineTo(28.0f, 62.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.34f, -4.0f)
                lineTo(168.33f, 36.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, 104.0f)
                lineToRelative(-137.0f, -22.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 113.22f)
                close()
                moveTo(140.0f, 200.0f)
                lineTo(140.0f, 143.39f)
                lineTo(167.34f, 148.0f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, 0.66f, 0.05f)
                arcToRelative(59.62f, 59.62f, 0.0f, false, false, 25.46f, -5.69f)
                lineToRelative(-27.0f, 59.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.64f, 2.35f)
                lineTo(144.0f, 204.05f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_hair-dryer-thin`!!
    }

private var `_hair-dryer-thin`: ImageVector? = null
