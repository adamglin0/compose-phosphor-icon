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

public val LightGroup.`Stairs-light`: ImageVector
    get() {
        if (`_stairs-light` != null) {
            return `_stairs-light`!!
        }
        `_stairs-light` = Builder(name = "Stairs-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                lineTo(42.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 26.0f)
                close()
                moveTo(152.0f, 142.0f)
                horizontalLineToRelative(50.0f)
                verticalLineToRelative(28.0f)
                lineTo(110.0f, 170.0f)
                lineTo(110.0f, 142.0f)
                close()
                moveTo(158.0f, 130.0f)
                lineTo(158.0f, 102.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(28.0f)
                close()
                moveTo(56.0f, 38.0f)
                lineTo(200.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(202.0f, 90.0f)
                lineTo(152.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(34.0f)
                lineTo(104.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(34.0f)
                lineTo(54.0f, 170.0f)
                lineTo(54.0f, 40.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 56.0f, 38.0f)
                close()
                moveTo(200.0f, 218.0f)
                lineTo(56.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 182.0f)
                lineTo(202.0f, 182.0f)
                verticalLineToRelative(34.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 200.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_stairs-light`!!
    }

private var `_stairs-light`: ImageVector? = null
