package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Fileppt: ImageVector
    get() {
        if (_fileppt != null) {
            return _fileppt!!
        }
        _fileppt = Builder(name = "Fileppt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 152.53f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -8.25f, 7.47f)
                lineTo(204.0f, 160.0f)
                verticalLineToRelative(47.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                lineTo(188.0f, 160.0f)
                lineTo(176.27f, 160.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -8.25f, -7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.53f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 152.53f)
                close()
                moveTo(92.0f, 172.85f)
                curveTo(91.54f, 188.08f, 78.64f, 200.0f, 63.4f, 200.0f)
                lineTo(56.0f, 200.0f)
                verticalLineToRelative(7.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 48.53f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 208.0f)
                lineTo(40.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(64.0f, 144.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 92.0f, 172.85f)
                close()
                moveTo(76.0f, 170.85f)
                arcTo(12.25f, 12.25f, 0.0f, false, false, 63.65f, 160.0f)
                lineTo(56.0f, 160.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 170.84f)
                close()
                moveTo(160.0f, 172.85f)
                curveTo(159.54f, 188.08f, 146.64f, 200.0f, 131.4f, 200.0f)
                lineTo(124.0f, 200.0f)
                verticalLineToRelative(7.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f)
                lineTo(108.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 160.0f, 172.85f)
                close()
                moveTo(144.0f, 170.85f)
                arcTo(12.25f, 12.25f, 0.0f, false, false, 131.65f, 160.0f)
                lineTo(124.0f, 160.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 170.84f)
                close()
                moveTo(40.0f, 116.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(44.0f, 120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 116.0f)
                close()
                moveTo(152.0f, 88.0f)
                horizontalLineToRelative(44.0f)
                lineTo(152.0f, 44.0f)
                close()
            }
        }
        .build()
        return _fileppt!!
    }

private var _fileppt: ImageVector? = null
