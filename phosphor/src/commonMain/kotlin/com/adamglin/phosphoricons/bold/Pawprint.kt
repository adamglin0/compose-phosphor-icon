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

public val BoldGroup.Pawprint: ImageVector
    get() {
        if (_pawprint != null) {
            return _pawprint!!
        }
        _pawprint = Builder(name = "Pawprint", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 236.0f, 108.0f)
                close()
                moveTo(68.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 68.0f, 108.0f)
                close()
                moveTo(92.0f, 84.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 68.0f, 60.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 92.0f, 84.0f)
                close()
                moveTo(164.0f, 84.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 84.0f)
                close()
                moveTo(212.0f, 184.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -61.1f, 40.55f)
                arcToRelative(60.15f, 60.15f, 0.0f, false, false, -45.8f, 0.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 67.0f, 145.34f)
                arcTo(31.33f, 31.33f, 0.0f, false, false, 81.91f, 126.6f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 92.18f, 0.0f)
                arcTo(31.34f, 31.34f, 0.0f, false, false, 189.0f, 145.34f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 212.0f, 184.0f)
                close()
                moveTo(188.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -10.49f, -17.6f)
                lineToRelative(-0.1f, -0.06f)
                arcToRelative(55.22f, 55.22f, 0.0f, false, true, -26.37f, -33.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -46.08f, 0.0f)
                arcToRelative(55.21f, 55.21f, 0.0f, false, true, -26.37f, 33.05f)
                lineToRelative(-0.1f, 0.06f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 88.0f, 204.0f)
                arcToRelative(19.77f, 19.77f, 0.0f, false, false, 7.8f, -1.58f)
                lineToRelative(0.13f, 0.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 64.14f, 0.0f)
                lineToRelative(0.13f, 0.0f)
                arcTo(19.77f, 19.77f, 0.0f, false, false, 168.0f, 204.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 188.0f, 184.0f)
                close()
            }
        }
        .build()
        return _pawprint!!
    }

private var _pawprint: ImageVector? = null
