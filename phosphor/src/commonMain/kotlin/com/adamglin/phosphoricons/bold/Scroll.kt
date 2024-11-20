package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 92.0f)
                close()
                moveTo(104.0f, 144.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(104.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(236.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineTo(88.0f, 228.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(52.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                curveToRelative(0.0f, 3.73f, 3.35f, 6.51f, 3.38f, 6.54f)
                lineToRelative(-0.18f, -0.14f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 16.81f, 89.59f)
                horizontalLineToRelative(0.0f)
                curveTo(15.49f, 88.62f, 4.0f, 79.55f, 4.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 40.0f, 28.0f)
                lineTo(176.0f, 28.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                lineTo(212.0f, 164.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.2f, 2.4f)
                curveTo(224.51f, 167.38f, 236.0f, 176.45f, 236.0f, 192.0f)
                close()
                moveTo(92.62f, 172.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 164.0f)
                horizontalLineToRelative(84.0f)
                lineTo(188.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(73.94f, 52.0f)
                arcTo(35.88f, 35.88f, 0.0f, false, true, 76.0f, 64.0f)
                lineTo(76.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                curveToRelative(0.0f, -3.58f, -3.17f, -6.38f, -3.2f, -6.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.62f, 172.2f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(7.69f, 7.69f, 0.0f, false, false, -1.24f, -4.0f)
                horizontalLineToRelative(-87.0f)
                arcToRelative(30.32f, 30.32f, 0.0f, false, true, 0.26f, 4.0f)
                arcToRelative(35.84f, 35.84f, 0.0f, false, true, -2.06f, 12.0f)
                lineTo(200.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 212.0f, 192.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
