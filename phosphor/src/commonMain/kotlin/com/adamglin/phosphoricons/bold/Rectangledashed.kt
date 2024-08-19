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

public val BoldGroup.Rectangledashed: ImageVector
    get() {
        if (_rectangledashed != null) {
            return _rectangledashed!!
        }
        _rectangledashed = Builder(name = "Rectangledashed", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 60.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 48.0f)
                close()
                moveTo(32.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(44.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 156.0f)
                close()
                moveTo(72.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(144.0f, 196.0f)
                lineTo(112.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(224.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(184.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 184.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 172.0f)
                close()
                moveTo(224.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 100.0f)
                close()
                moveTo(216.0f, 36.0f)
                lineTo(184.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(28.0f)
                lineTo(212.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(144.0f, 36.0f)
                lineTo(112.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _rectangledashed!!
    }

private var _rectangledashed: ImageVector? = null
