package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Person-simple-swim-fill`: ImageVector
    get() {
        if (`_person-simple-swim-fill` != null) {
            return `_person-simple-swim-fill`!!
        }
        `_person-simple-swim-fill` = Builder(name = "Person-simple-swim-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 144.0f, 72.0f)
                close()
                moveTo(210.89f, 184.19f)
                curveToRelative(-31.83f, 26.39f, -53.72f, 14.51f, -79.07f, 0.74f)
                curveToRelative(-26.61f, -14.44f, -56.76f, -30.81f, -96.93f, 2.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.22f, 12.31f)
                curveToRelative(31.83f, -26.39f, 53.72f, -14.5f, 79.07f, -0.74f)
                curveToRelative(15.11f, 8.2f, 31.35f, 17.0f, 49.93f, 17.0f)
                curveToRelative(14.14f, 0.0f, 29.64f, -5.11f, 47.0f, -19.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.22f, -12.32f)
                close()
                moveTo(34.89f, 147.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.22f, 12.31f)
                curveToRelative(31.83f, -26.38f, 53.72f, -14.5f, 79.07f, -0.74f)
                curveToRelative(15.11f, 8.2f, 31.35f, 17.0f, 49.93f, 17.0f)
                curveToRelative(14.14f, 0.0f, 29.64f, -5.11f, 47.0f, -19.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.22f, -12.31f)
                arcToRelative(75.79f, 75.79f, 0.0f, false, true, -19.28f, 12.06f)
                lineToRelative(-53.84f, -53.82f)
                arcTo(103.34f, 103.34f, 0.0f, false, false, 64.24f, 72.0f)
                lineTo(40.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(64.24f, 88.0f)
                arcToRelative(87.66f, 87.66f, 0.0f, false, true, 41.88f, 10.56f)
                lineTo(76.49f, 128.17f)
                curveTo(63.82f, 129.36f, 50.07f, 134.84f, 34.89f, 147.42f)
                close()
            }
        }
        .build()
        return `_person-simple-swim-fill`!!
    }

private var `_person-simple-swim-fill`: ImageVector? = null
