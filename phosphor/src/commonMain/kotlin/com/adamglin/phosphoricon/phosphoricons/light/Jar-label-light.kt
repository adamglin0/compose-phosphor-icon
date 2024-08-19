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

public val LightGroup.`Jar-label-light`: ImageVector
    get() {
        if (`_jar-label-light` != null) {
            return `_jar-label-light`!!
        }
        `_jar-label-light` = Builder(name = "Jar-label-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 50.48f)
                lineTo(182.0f, 32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(88.0f, 18.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 74.0f, 32.0f)
                lineTo(74.0f, 50.48f)
                arcTo(38.05f, 38.05f, 0.0f, false, false, 42.0f, 88.0f)
                lineTo(42.0f, 200.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(214.0f, 88.0f)
                arcTo(38.05f, 38.05f, 0.0f, false, false, 182.0f, 50.48f)
                close()
                moveTo(54.0f, 110.0f)
                lineTo(202.0f, 110.0f)
                verticalLineToRelative(68.0f)
                lineTo(54.0f, 178.0f)
                close()
                moveTo(170.0f, 32.0f)
                lineTo(170.0f, 50.0f)
                lineTo(150.0f, 50.0f)
                lineTo(150.0f, 30.0f)
                horizontalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 170.0f, 32.0f)
                close()
                moveTo(118.0f, 50.0f)
                lineTo(118.0f, 30.0f)
                horizontalLineToRelative(20.0f)
                lineTo(138.0f, 50.0f)
                close()
                moveTo(88.0f, 30.0f)
                horizontalLineToRelative(18.0f)
                lineTo(106.0f, 50.0f)
                lineTo(86.0f, 50.0f)
                lineTo(86.0f, 32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 88.0f, 30.0f)
                close()
                moveTo(80.0f, 62.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                lineTo(202.0f, 98.0f)
                lineTo(54.0f, 98.0f)
                lineTo(54.0f, 88.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 80.0f, 62.0f)
                close()
                moveTo(176.0f, 226.0f)
                lineTo(80.0f, 226.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(54.0f, 190.0f)
                lineTo(202.0f, 190.0f)
                verticalLineToRelative(10.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 176.0f, 226.0f)
                close()
            }
        }
        .build()
        return `_jar-label-light`!!
    }

private var `_jar-label-light`: ImageVector? = null
