package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Mopedfront: ImageVector
    get() {
        if (_mopedfront != null) {
            return _mopedfront!!
        }
        _mopedfront = Builder(name = "Mopedfront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                lineTo(163.77f, 44.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -71.54f, 0.0f)
                lineTo(48.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(92.23f, 52.0f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, false, 17.34f, 26.91f)
                arcTo(60.11f, 60.11f, 0.0f, false, false, 68.0f, 136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(188.0f, 136.0f)
                arcToRelative(60.11f, 60.11f, 0.0f, false, false, -41.57f, -57.09f)
                arcTo(36.06f, 36.06f, 0.0f, false, false, 163.77f, 52.0f)
                lineTo(208.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(148.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(108.0f, 168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                close()
                moveTo(180.0f, 136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(156.0f, 204.0f)
                lineTo(156.0f, 168.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(36.0f)
                lineTo(80.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(76.0f, 136.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f)
                close()
                moveTo(128.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 76.0f)
                close()
            }
        }
        .build()
        return _mopedfront!!
    }

private var _mopedfront: ImageVector? = null
