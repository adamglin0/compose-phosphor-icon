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

public val LightGroup.`Eyeglasses-light`: ImageVector
    get() {
        if (`_eyeglasses-light` != null) {
            return `_eyeglasses-light`!!
        }
        `_eyeglasses-light` = Builder(name = "Eyeglasses-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f)
                verticalLineToRelative(62.65f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 147.21f, 154.0f)
                lineTo(108.79f, 154.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 38.0f, 134.65f)
                lineTo(38.0f, 72.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 56.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 26.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 84.0f, 2.0f)
                horizontalLineToRelative(36.1f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 230.0f, 164.0f)
                lineTo(230.0f, 72.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 200.0f, 42.0f)
                close()
                moveTo(68.0f, 194.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 68.0f, 194.0f)
                close()
                moveTo(188.0f, 194.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 188.0f, 194.0f)
                close()
            }
        }
        .build()
        return `_eyeglasses-light`!!
    }

private var `_eyeglasses-light`: ImageVector? = null
