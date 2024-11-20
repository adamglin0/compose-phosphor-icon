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

public val BoldGroup.Bridge: ImageVector
    get() {
        if (_bridge != null) {
            return _bridge!!
        }
        _bridge = Builder(name = "Bridge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 156.0f)
                lineTo(204.0f, 156.0f)
                lineTo(204.0f, 111.49f)
                arcToRelative(76.39f, 76.39f, 0.0f, false, false, 23.49f, 15.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.0f, -22.25f)
                arcTo(51.81f, 51.81f, 0.0f, false, true, 204.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 76.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(51.81f, 51.81f, 0.0f, false, true, -32.5f, 48.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 9.0f, 22.25f)
                arcToRelative(76.39f, 76.39f, 0.0f, false, false, 23.49f, -15.0f)
                lineTo(51.99f, 156.0f)
                lineTo(24.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(52.0f, 180.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(76.0f, 180.0f)
                lineTo(180.0f, 180.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(204.0f, 180.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(140.0f, 131.05f)
                lineTo(140.0f, 156.0f)
                lineTo(116.0f, 156.0f)
                lineTo(116.0f, 131.05f)
                arcToRelative(76.26f, 76.26f, 0.0f, false, false, 24.0f, 0.0f)
                close()
                moveTo(76.0f, 111.38f)
                arcToRelative(76.44f, 76.44f, 0.0f, false, false, 16.0f, 11.53f)
                lineTo(92.0f, 156.0f)
                lineTo(76.0f, 156.0f)
                close()
                moveTo(164.0f, 156.0f)
                lineTo(164.0f, 122.91f)
                arcToRelative(76.44f, 76.44f, 0.0f, false, false, 16.0f, -11.53f)
                lineTo(180.0f, 156.0f)
                close()
            }
        }
        .build()
        return _bridge!!
    }

private var _bridge: ImageVector? = null
