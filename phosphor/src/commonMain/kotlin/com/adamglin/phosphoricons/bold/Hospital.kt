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

public val BoldGroup.Hospital: ImageVector
    get() {
        if (_hospital != null) {
            return _hospital!!
        }
        _hospital = Builder(name = "Hospital", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 204.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(240.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(172.0f, 108.0f)
                lineTo(172.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(56.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 204.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(244.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(216.0f, 132.0f)
                verticalLineToRelative(72.0f)
                lineTo(172.0f, 204.0f)
                lineTo(172.0f, 132.0f)
                close()
                moveTo(60.0f, 52.0f)
                horizontalLineToRelative(88.0f)
                lineTo(148.0f, 204.0f)
                lineTo(136.0f, 204.0f)
                lineTo(136.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(84.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(44.0f)
                lineTo(60.0f, 204.0f)
                close()
                moveTo(112.0f, 204.0f)
                lineTo(96.0f, 204.0f)
                lineTo(96.0f, 172.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(72.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 84.0f)
                horizontalLineToRelative(8.0f)
                lineTo(92.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                lineTo(84.0f, 108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 96.0f)
                close()
            }
        }
        .build()
        return _hospital!!
    }

private var _hospital: ImageVector? = null
