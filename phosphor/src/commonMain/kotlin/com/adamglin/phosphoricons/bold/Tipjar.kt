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

public val BoldGroup.TipJar: ImageVector
    get() {
        if (_tipJar != null) {
            return _tipJar!!
        }
        _tipJar = Builder(name = "TipJar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(196.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(60.0f, 92.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 72.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(168.0f, 162.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -28.0f, 29.93f)
                lineTo(140.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(118.0f, 156.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -2.0f, -59.93f)
                lineTo(116.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(118.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(20.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 168.0f, 162.0f)
                close()
            }
        }
        .build()
        return _tipJar!!
    }

private var _tipJar: ImageVector? = null
