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

public val FillGroup.`Bell-simple-slash-fill`: ImageVector
    get() {
        if (`_bell-simple-slash-fill` != null) {
            return `_bell-simple-slash-fill`!!
        }
        `_bell-simple-slash-fill` = Builder(name = "Bell-simple-slash-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.84f, 192.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, true, -3.0f, 0.28f)
                lineTo(83.27f, 43.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.8f, -6.0f)
                arcTo(79.55f, 79.55f, 0.0f, false, true, 129.17f, 24.0f)
                curveTo(173.0f, 24.66f, 207.8f, 61.1f, 208.0f, 104.92f)
                curveToRelative(0.14f, 34.88f, 8.31f, 61.54f, 13.82f, 71.0f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 221.84f, 192.0f)
                close()
                moveTo(160.0f, 216.0f)
                horizontalLineTo(96.22f)
                arcTo(8.19f, 8.19f, 0.0f, false, false, 88.0f, 223.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 232.0f)
                horizontalLineToRelative(63.74f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, 8.26f, -7.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 216.0f)
                close()
                moveTo(53.84f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.0f, 45.38f)
                lineTo(58.79f, 63.85f)
                arcTo(79.42f, 79.42f, 0.0f, false, false, 47.93f, 104.0f)
                curveToRelative(0.0f, 35.09f, -8.15f, 62.0f, -13.7f, 71.73f)
                arcToRelative(16.42f, 16.42f, 0.0f, false, false, 0.09f, 16.68f)
                arcTo(15.78f, 15.78f, 0.0f, false, false, 47.91f, 200.0f)
                horizontalLineTo(182.62f)
                lineToRelative(19.45f, 21.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.85f, -10.76f)
                close()
            }
        }
        .build()
        return `_bell-simple-slash-fill`!!
    }

private var `_bell-simple-slash-fill`: ImageVector? = null
