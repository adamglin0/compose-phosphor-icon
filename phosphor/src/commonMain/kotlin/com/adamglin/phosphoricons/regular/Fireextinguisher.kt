package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Fireextinguisher: ImageVector
    get() {
        if (_fireextinguisher != null) {
            return _fireextinguisher!!
        }
        _fireextinguisher = Builder(name = "Fireextinguisher", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.3f, 48.34f)
                lineToRelative(-60.68f, -18.2f)
                lineToRelative(30.0f, -15.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 180.42f, 0.85f)
                lineTo(134.0f, 24.05f)
                arcToRelative(80.08f, 80.08f, 0.0f, false, false, -78.0f, 80.0f)
                lineTo(56.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 176.0f)
                lineTo(88.0f, 176.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(184.0f, 104.0f)
                arcToRelative(48.07f, 48.07f, 0.0f, false, false, -40.0f, -47.32f)
                lineTo(144.0f, 42.75f)
                lineToRelative(69.7f, 20.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 4.6f, -15.32f)
                close()
                moveTo(72.0f, 160.0f)
                lineTo(72.0f, 104.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, 56.0f, -63.48f)
                lineTo(128.0f, 56.68f)
                arcTo(48.07f, 48.07f, 0.0f, false, false, 88.0f, 104.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(168.0f, 232.0f)
                lineTo(104.0f, 232.0f)
                lineTo(104.0f, 176.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(168.0f, 104.0f)
                verticalLineToRelative(56.0f)
                lineTo(104.0f, 160.0f)
                lineTo(104.0f, 104.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fireextinguisher!!
    }

private var _fireextinguisher: ImageVector? = null
