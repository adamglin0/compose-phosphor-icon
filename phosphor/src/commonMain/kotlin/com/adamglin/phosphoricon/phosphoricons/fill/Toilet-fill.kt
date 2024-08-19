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

public val FillGroup.`Toilet-fill`: ImageVector
    get() {
        if (`_toilet-fill` != null) {
            return `_toilet-fill`!!
        }
        `_toilet-fill` = Builder(name = "Toilet-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.0f, 88.0f)
                lineTo(196.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(200.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 88.0f)
                close()
                moveTo(88.0f, 48.0f)
                horizontalLineToRelative(15.73f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 112.0f, 55.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 64.0f)
                lineTo(88.27f, 64.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 80.0f, 56.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 48.0f)
                close()
                moveTo(224.0f, 112.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.06f)
                lineTo(40.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.06f)
                arcToRelative(96.1f, 96.1f, 0.0f, false, false, 51.68f, 85.08f)
                lineToRelative(-3.47f, 24.27f)
                arcToRelative(16.43f, 16.43f, 0.0f, false, false, 1.63f, 10.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 240.0f)
                horizontalLineToRelative(63.66f)
                arcToRelative(16.52f, 16.52f, 0.0f, false, false, 9.72f, -3.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.46f, -15.23f)
                lineToRelative(-3.52f, -24.6f)
                arcTo(96.1f, 96.1f, 0.0f, false, false, 224.0f, 112.06f)
                close()
                moveTo(96.0f, 224.0f)
                lineToRelative(2.93f, -20.5f)
                arcToRelative(96.15f, 96.15f, 0.0f, false, false, 58.14f, 0.0f)
                lineTo(160.0f, 224.0f)
                close()
            }
        }
        .build()
        return `_toilet-fill`!!
    }

private var `_toilet-fill`: ImageVector? = null
