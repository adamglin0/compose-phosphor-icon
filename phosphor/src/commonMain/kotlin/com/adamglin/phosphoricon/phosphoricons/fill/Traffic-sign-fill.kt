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

public val FillGroup.`Traffic-sign-fill`: ImageVector
    get() {
        if (`_traffic-sign-fill` != null) {
            return `_traffic-sign-fill`!!
        }
        `_traffic-sign-fill` = Builder(name = "Traffic-sign-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.15f, 116.29f)
                lineTo(139.71f, 12.85f)
                arcToRelative(16.56f, 16.56f, 0.0f, false, false, -23.42f, 0.0f)
                lineTo(12.85f, 116.29f)
                arcToRelative(16.56f, 16.56f, 0.0f, false, false, 0.0f, 23.42f)
                lineTo(116.29f, 243.15f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.56f, 16.56f, 0.0f, false, false, 23.42f, 0.0f)
                lineTo(243.15f, 139.71f)
                arcToRelative(16.56f, 16.56f, 0.0f, false, false, 0.0f, -23.42f)
                close()
                moveTo(173.66f, 125.66f)
                lineTo(149.66f, 149.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(148.69f, 128.0f)
                lineTo(112.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(36.69f)
                lineToRelative(-10.35f, -10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 173.66f, 125.66f)
                close()
            }
        }
        .build()
        return `_traffic-sign-fill`!!
    }

private var `_traffic-sign-fill`: ImageVector? = null
