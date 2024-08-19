package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Person-simple-throw`: ImageVector
    get() {
        if (`_person-simple-throw` != null) {
            return `_person-simple-throw`!!
        }
        `_person-simple-throw` = Builder(name = "Person-simple-throw", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 88.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 56.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 88.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(48.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 96.0f)
                close()
                moveTo(222.24f, 110.61f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 211.0f, 111.87f)
                curveToRelative(-1.15f, -0.89f, -23.71f, -17.7f, -59.32f, 0.61f)
                arcToRelative(214.93f, 214.93f, 0.0f, false, true, -3.0f, 30.35f)
                lineToRelative(32.43f, 27.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.47f, 8.68f)
                lineToRelative(-16.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.18f, -5.06f)
                lineToRelative(14.27f, -42.82f)
                lineToRelative(-22.08f, -18.4f)
                arcToRelative(141.86f, 141.86f, 0.0f, false, true, -5.1f, 14.33f)
                curveToRelative(-13.75f, 32.74f, -38.38f, 54.63f, -73.2f, 65.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.6f, -15.32f)
                curveToRelative(60.68f, -18.21f, 71.14f, -72.22f, 73.42f, -101.65f)
                curveTo(108.0f, 139.88f, 86.57f, 144.0f, 72.36f, 144.0f)
                arcToRelative(59.59f, 59.59f, 0.0f, false, true, -19.67f, -3.27f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 125.4f)
                arcToRelative(7.82f, 7.82f, 0.0f, false, true, 3.31f, 0.73f)
                reflectiveCurveToRelative(26.76f, 10.68f, 72.19f, -20.2f)
                curveToRelative(52.29f, -35.54f, 88.0f, -7.77f, 89.51f, -6.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 222.24f, 110.61f)
                close()
            }
        }
        .build()
        return `_person-simple-throw`!!
    }

private var `_person-simple-throw`: ImageVector? = null
