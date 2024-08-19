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

public val BoldGroup.Folderdashed: ImageVector
    get() {
        if (_folderdashed != null) {
            return _folderdashed!!
        }
        _folderdashed = Builder(name = "Folderdashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(39.38f, 220.0f)
                arcTo(19.41f, 19.41f, 0.0f, false, true, 20.0f, 200.62f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(88.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 208.0f)
                close()
                moveTo(160.0f, 196.0f)
                lineTo(128.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(224.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(44.0f)
                lineTo(200.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(16.89f)
                arcTo(19.13f, 19.13f, 0.0f, false, false, 236.0f, 200.89f)
                lineTo(236.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 140.0f)
                close()
                moveTo(216.0f, 68.0f)
                lineTo(168.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(32.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(44.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 164.0f)
                close()
                moveTo(20.0f, 80.0f)
                lineTo(20.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 32.0f)
                lineTo(92.41f, 32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 14.94f, 6.71f)
                horizontalLineToRelative(0.0f)
                lineTo(137.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.0f, 20.0f)
                lineTo(32.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 80.0f)
                close()
                moveTo(44.0f, 68.0f)
                horizontalLineToRelative(57.28f)
                lineTo(90.61f, 56.0f)
                lineTo(44.0f, 56.0f)
                close()
            }
        }
        .build()
        return _folderdashed!!
    }

private var _folderdashed: ImageVector? = null
