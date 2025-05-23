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

public val BoldGroup.SquaresFour: ImageVector
    get() {
        if (_squaresFour != null) {
            return _squaresFour!!
        }
        _squaresFour = Builder(name = "SquaresFour", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(120.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.0f, 36.0f)
                close()
                moveTo(96.0f, 96.0f)
                lineTo(60.0f, 96.0f)
                lineTo(60.0f, 60.0f)
                lineTo(96.0f, 60.0f)
                close()
                moveTo(200.0f, 36.0f)
                lineTo(156.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(196.0f, 96.0f)
                lineTo(160.0f, 96.0f)
                lineTo(160.0f, 60.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(100.0f, 136.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(120.0f, 156.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.0f, 136.0f)
                close()
                moveTo(96.0f, 196.0f)
                lineTo(60.0f, 196.0f)
                lineTo(60.0f, 160.0f)
                lineTo(96.0f, 160.0f)
                close()
                moveTo(200.0f, 136.0f)
                lineTo(156.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 156.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 136.0f)
                close()
                moveTo(196.0f, 196.0f)
                lineTo(160.0f, 196.0f)
                lineTo(160.0f, 160.0f)
                horizontalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return _squaresFour!!
    }

private var _squaresFour: ImageVector? = null
