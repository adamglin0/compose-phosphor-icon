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

public val BoldGroup.JarLabel: ImageVector
    get() {
        if (_jarLabel != null) {
            return _jarLabel!!
        }
        _jarLabel = Builder(name = "JarLabel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 49.68f)
                lineTo(188.0f, 32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(88.0f, 12.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 68.0f, 32.0f)
                lineTo(68.0f, 49.68f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 36.0f, 92.0f)
                lineTo(36.0f, 200.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(220.0f, 92.0f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 188.0f, 49.68f)
                close()
                moveTo(60.0f, 120.0f)
                lineTo(196.0f, 120.0f)
                verticalLineToRelative(48.0f)
                lineTo(60.0f, 168.0f)
                close()
                moveTo(164.0f, 48.0f)
                lineTo(140.0f, 48.0f)
                lineTo(140.0f, 36.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(116.0f, 36.0f)
                lineTo(116.0f, 48.0f)
                lineTo(92.0f, 48.0f)
                lineTo(92.0f, 36.0f)
                close()
                moveTo(80.0f, 72.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(4.0f)
                lineTo(60.0f, 96.0f)
                lineTo(60.0f, 92.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 72.0f)
                close()
                moveTo(176.0f, 220.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-8.0f)
                lineTo(196.0f, 192.0f)
                verticalLineToRelative(8.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 220.0f)
                close()
            }
        }
        .build()
        return _jarLabel!!
    }

private var _jarLabel: ImageVector? = null
