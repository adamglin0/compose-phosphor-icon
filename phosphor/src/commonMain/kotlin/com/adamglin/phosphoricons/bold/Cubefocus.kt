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

public val BoldGroup.Cubefocus: ImageVector
    get() {
        if (_cubefocus != null) {
            return _cubefocus!!
        }
        _cubefocus = Builder(name = "Cubefocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 48.0f)
                lineTo(236.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 60.0f)
                lineTo(184.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 48.0f)
                close()
                moveTo(72.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(224.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(28.0f)
                lineTo(184.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 156.0f)
                close()
                moveTo(32.0f, 100.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 88.0f)
                lineTo(44.0f, 60.0f)
                lineTo(72.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(32.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 48.0f)
                lineTo(20.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 100.0f)
                close()
                moveTo(190.0f, 170.42f)
                lineTo(134.0f, 202.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.9f, 0.0f)
                lineToRelative(-56.0f, -32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 160.0f)
                lineTo(60.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.0f, -10.42f)
                lineToRelative(56.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.9f, 0.0f)
                lineToRelative(56.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 196.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 190.0f, 170.42f)
                close()
                moveTo(96.19f, 96.0f)
                lineTo(128.0f, 114.18f)
                lineTo(159.81f, 96.0f)
                lineTo(128.0f, 77.82f)
                close()
                moveTo(84.0f, 153.0f)
                lineToRelative(32.0f, 18.28f)
                lineTo(116.0f, 135.0f)
                lineTo(84.0f, 116.68f)
                close()
                moveTo(172.0f, 153.0f)
                lineTo(172.0f, 116.68f)
                lineTo(140.0f, 135.0f)
                verticalLineToRelative(36.36f)
                close()
            }
        }
        .build()
        return _cubefocus!!
    }

private var _cubefocus: ImageVector? = null
