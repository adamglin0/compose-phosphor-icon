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

public val BoldGroup.Club: ImageVector
    get() {
        if (_club != null) {
            return _club!!
        }
        _club = Builder(name = "Club", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.79f, 84.06f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -117.58f, 0.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 19.0f, 117.73f)
                lineToRelative(-4.0f, 19.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 236.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.77f, -14.35f)
                lineToRelative(-4.0f, -19.86f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 19.0f, -117.73f)
                close()
                moveTo(184.0f, 180.0f)
                arcToRelative(35.88f, 35.88f, 0.0f, false, true, -24.78f, -9.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.0f, 11.06f)
                lineTo(145.36f, 212.0f)
                horizontalLineTo(110.64f)
                lineToRelative(6.16f, -30.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.0f, -11.06f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -12.65f, -60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.0f, -18.0f)
                arcTo(35.68f, 35.68f, 0.0f, false, true, 92.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 65.88f, 20.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.0f, 18.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 184.0f, 180.0f)
                close()
            }
        }
        .build()
        return _club!!
    }

private var _club: ImageVector? = null
