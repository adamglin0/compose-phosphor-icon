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

public val BoldGroup.ColumnsPlusLeft: ImageVector
    get() {
        if (_columnsPlusLeft != null) {
            return _columnsPlusLeft!!
        }
        _columnsPlusLeft = Builder(name = "ColumnsPlusLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 28.0f)
                lineTo(100.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 80.0f, 48.0f)
                lineTo(80.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(144.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 124.0f, 28.0f)
                close()
                moveTo(120.0f, 204.0f)
                lineTo(104.0f, 204.0f)
                lineTo(104.0f, 52.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(200.0f, 28.0f)
                lineTo(176.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(156.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(196.0f, 204.0f)
                lineTo(180.0f, 204.0f)
                lineTo(180.0f, 52.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(68.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 140.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                lineTo(16.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 128.0f)
                close()
            }
        }
        .build()
        return _columnsPlusLeft!!
    }

private var _columnsPlusLeft: ImageVector? = null
