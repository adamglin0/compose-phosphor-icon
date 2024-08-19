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

public val BoldGroup.Trolleysuitcase: ImageVector
    get() {
        if (_trolleysuitcase != null) {
            return _trolleysuitcase!!
        }
        _trolleysuitcase = Builder(name = "Trolleysuitcase", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 156.0f)
                lineTo(216.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(192.0f, 56.0f)
                lineTo(192.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(140.0f, 20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(120.0f, 56.0f)
                lineTo(96.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 76.0f, 76.0f)
                verticalLineToRelative(60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 96.0f, 156.0f)
                close()
                moveTo(144.0f, 44.0f)
                horizontalLineToRelative(24.0f)
                lineTo(168.0f, 56.0f)
                lineTo(144.0f, 56.0f)
                close()
                moveTo(100.0f, 80.0f)
                lineTo(212.0f, 80.0f)
                verticalLineToRelative(52.0f)
                lineTo(100.0f, 132.0f)
                close()
                moveTo(92.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 92.0f, 224.0f)
                close()
                moveTo(236.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 224.0f)
                close()
                moveTo(252.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(36.0f, 77.0f)
                lineTo(15.51f, 56.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(54.14f, 61.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 60.0f, 75.31f)
                lineTo(60.0f, 168.0f)
                lineTo(240.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 180.0f)
                close()
            }
        }
        .build()
        return _trolleysuitcase!!
    }

private var _trolleysuitcase: ImageVector? = null
