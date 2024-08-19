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

public val LightGroup.`Chalkboard-teacher-light`: ImageVector
    get() {
        if (`_chalkboard-teacher-light` != null) {
            return `_chalkboard-teacher-light`!!
        }
        `_chalkboard-teacher-light` = Builder(name = "Chalkboard-teacher-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(53.39f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.42f, -3.43f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 90.38f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.42f, 3.43f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(78.0f, 144.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 78.0f, 144.0f)
                close()
                moveTo(218.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(158.27f, 202.0f)
                arcToRelative(62.34f, 62.34f, 0.0f, false, false, -31.48f, -27.61f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -45.58f, 0.0f)
                arcTo(62.34f, 62.34f, 0.0f, false, false, 49.73f, 202.0f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(198.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(176.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(10.0f)
                lineTo(186.0f, 86.0f)
                lineTo(70.0f, 86.0f)
                lineTo(70.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(58.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(192.0f, 74.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_chalkboard-teacher-light`!!
    }

private var `_chalkboard-teacher-light`: ImageVector? = null
