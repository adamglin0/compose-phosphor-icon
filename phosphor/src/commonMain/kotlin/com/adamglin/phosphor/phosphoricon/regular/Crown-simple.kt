package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Crown-simple`: ImageVector
    get() {
        if (`_crown-simple` != null) {
            return `_crown-simple`!!
        }
        `_crown-simple` = Builder(name = "Crown-simple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.9f, 73.6f)
                arcTo(15.85f, 15.85f, 0.0f, false, false, 212.0f, 77.39f)
                lineToRelative(-33.67f, 36.29f)
                lineToRelative(-35.8f, -80.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -0.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -29.06f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 0.1f)
                lineToRelative(-35.8f, 80.29f)
                lineTo(44.0f, 77.39f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.25f, 90.81f)
                curveToRelative(0.0f, 0.11f, 0.0f, 0.21f, 0.07f, 0.32f)
                lineTo(39.0f, 195.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.72f, 13.0f)
                horizontalLineTo(201.29f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 217.0f, 195.0f)
                lineTo(239.68f, 91.13f)
                curveToRelative(0.0f, -0.11f, 0.0f, -0.21f, 0.07f, -0.32f)
                arcTo(15.85f, 15.85f, 0.0f, false, false, 230.9f, 73.6f)
                close()
                moveTo(201.35f, 191.68f)
                lineToRelative(-0.06f, 0.32f)
                horizontalLineTo(54.71f)
                lineToRelative(-0.06f, -0.32f)
                lineTo(32.0f, 88.0f)
                lineToRelative(0.14f, 0.16f)
                lineToRelative(42.0f, 45.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.18f, -2.18f)
                lineTo(128.0f, 40.0f)
                lineToRelative(40.69f, 91.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.18f, 2.18f)
                lineToRelative(42.0f, -45.24f)
                lineTo(224.0f, 88.0f)
                close()
            }
        }
        .build()
        return `_crown-simple`!!
    }

private var `_crown-simple`: ImageVector? = null
