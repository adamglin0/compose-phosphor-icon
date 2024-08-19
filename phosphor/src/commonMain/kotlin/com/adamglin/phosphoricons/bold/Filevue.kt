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

public val BoldGroup.Filevue: ImageVector
    get() {
        if (_filevue != null) {
            return _filevue!!
        }
        _filevue = Builder(name = "Filevue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.3f, 156.0f)
                lineToRelative(-20.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.6f, 0.0f)
                lineToRelative(-20.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 47.3f, 148.0f)
                lineTo(56.0f, 172.32f)
                lineTo(64.7f, 148.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 87.3f, 156.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(192.0f, 196.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(192.0f, 168.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(180.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(144.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(120.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f)
                lineTo(156.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 140.0f)
                close()
                moveTo(36.0f, 108.0f)
                lineTo(36.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 56.0f, 20.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.49f, 3.52f)
                lineToRelative(56.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 88.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                lineTo(148.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(136.0f, 44.0f)
                lineTo(60.0f, 44.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(160.0f, 80.0f)
                horizontalLineToRelative(23.0f)
                lineTo(160.0f, 57.0f)
                close()
            }
        }
        .build()
        return _filevue!!
    }

private var _filevue: ImageVector? = null
