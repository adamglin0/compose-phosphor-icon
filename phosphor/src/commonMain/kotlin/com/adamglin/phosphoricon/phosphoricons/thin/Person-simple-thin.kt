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

public val ThinGroup.`Person-simple-thin`: ImageVector
    get() {
        if (`_person-simple-thin` != null) {
            return `_person-simple-thin`!!
        }
        `_person-simple-thin` = Builder(name = "Person-simple-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.43f, 130.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.49f, 1.37f)
                curveToRelative(-0.38f, -0.23f, -37.87f, -22.29f, -89.94f, -23.38f)
                verticalLineToRelative(42.43f)
                lineToRelative(63.0f, 70.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 5.32f)
                lineTo(128.0f, 158.0f)
                lineTo(67.0f, 226.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -5.32f)
                lineToRelative(63.0f, -70.86f)
                lineTo(124.0f, 108.05f)
                curveToRelative(-52.07f, 1.09f, -89.56f, 23.15f, -89.94f, 23.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.12f, -6.86f)
                curveToRelative(1.67f, -1.0f, 41.6f, -24.57f, 98.06f, -24.57f)
                reflectiveCurveToRelative(96.39f, 23.57f, 98.06f, 24.57f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 227.43f, 130.06f)
                close()
                moveTo(100.0f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 48.0f)
                close()
                moveTo(108.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 108.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_person-simple-thin`!!
    }

private var `_person-simple-thin`: ImageVector? = null
