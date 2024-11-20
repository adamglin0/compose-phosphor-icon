package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Cow: ImageVector
    get() {
        if (_cow != null) {
            return _cow!!
        }
        _cow = Builder(name = "Cow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(96.0f, 188.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 192.0f)
                close()
                moveTo(176.0f, 188.0f)
                lineTo(160.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(100.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 116.0f)
                close()
                moveTo(156.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 116.0f)
                close()
                moveTo(241.3f, 119.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 124.0f)
                lineTo(196.0f, 124.0f)
                verticalLineToRelative(38.08f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 176.0f, 228.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -20.0f, -65.92f)
                lineTo(60.0f, 124.0f)
                lineTo(24.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.32f, -4.41f)
                arcToRelative(11.82f, 11.82f, 0.0f, false, true, -2.47f, -9.85f)
                arcTo(52.11f, 52.11f, 0.0f, false, true, 63.22f, 68.0f)
                lineTo(76.34f, 68.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 52.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -24.34f, 44.0f)
                horizontalLineToRelative(13.12f)
                arcToRelative(52.11f, 52.11f, 0.0f, false, true, 51.0f, 41.74f)
                arcTo(11.82f, 11.82f, 0.0f, false, true, 241.3f, 119.59f)
                close()
                moveTo(60.0f, 116.0f)
                lineTo(60.0f, 104.0f)
                arcTo(35.94f, 35.94f, 0.0f, false, true, 73.41f, 76.0f)
                lineTo(63.22f, 76.0f)
                arcToRelative(44.09f, 44.09f, 0.0f, false, false, -43.14f, 35.31f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, false, 0.81f, 3.21f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 116.0f)
                close()
                moveTo(176.0f, 164.0f)
                lineTo(80.0f, 164.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 56.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(188.0f, 158.06f)
                lineTo(188.0f, 104.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(96.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(54.06f)
                arcTo(35.88f, 35.88f, 0.0f, false, true, 80.0f, 156.0f)
                horizontalLineToRelative(96.0f)
                arcTo(35.88f, 35.88f, 0.0f, false, true, 188.0f, 158.06f)
                close()
                moveTo(235.92f, 111.31f)
                arcTo(44.09f, 44.09f, 0.0f, false, false, 192.78f, 76.0f)
                lineTo(182.59f, 76.0f)
                arcTo(35.94f, 35.94f, 0.0f, false, true, 196.0f, 104.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.13f, -1.48f)
                arcTo(3.82f, 3.82f, 0.0f, false, false, 235.92f, 111.31f)
                close()
            }
        }
        .build()
        return _cow!!
    }

private var _cow: ImageVector? = null
