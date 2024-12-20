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

public val BoldGroup.Barn: ImageVector
    get() {
        if (_barn != null) {
            return _barn!!
        }
        _barn = Builder(name = "Barn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(112.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 84.0f)
                close()
                moveTo(252.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(16.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(20.0f, 139.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 6.24f, 121.0f)
                lineToRelative(40.0f, -56.0f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, true, 2.94f, -2.9f)
                lineToRelative(67.56f, -46.65f)
                lineToRelative(0.17f, -0.11f)
                arcToRelative(19.94f, 19.94f, 0.0f, false, true, 22.18f, 0.0f)
                lineToRelative(0.17f, 0.11f)
                lineToRelative(67.56f, 46.65f)
                arcToRelative(11.91f, 11.91f, 0.0f, false, true, 2.94f, 2.9f)
                lineToRelative(40.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 139.31f)
                lineTo(236.0f, 188.0f)
                horizontalLineToRelative(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 200.0f)
                close()
                moveTo(44.0f, 188.0f)
                lineTo(64.0f, 188.0f)
                lineTo(64.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(180.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(20.0f)
                lineTo(212.0f, 109.45f)
                lineTo(191.45f, 80.69f)
                lineTo(128.0f, 36.87f)
                lineTo(64.55f, 80.69f)
                lineTo(44.0f, 109.45f)
                close()
                moveTo(168.0f, 136.0f)
                lineTo(113.9f, 136.0f)
                lineTo(168.0f, 174.07f)
                close()
                moveTo(88.0f, 188.0f)
                horizontalLineToRelative(58.1f)
                lineTo(88.0f, 147.12f)
                close()
            }
        }
        .build()
        return _barn!!
    }

private var _barn: ImageVector? = null
