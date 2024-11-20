package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.0f, 204.5f)
                verticalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(204.5f)
                arcToRelative(65.64f, 65.64f, 0.0f, false, false, -36.48f, -59.0f)
                lineToRelative(-48.4f, -24.2f)
                arcTo(77.57f, 77.57f, 0.0f, false, true, 58.0f, 51.5f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(51.5f)
                arcToRelative(65.64f, 65.64f, 0.0f, false, false, 36.48f, 59.0f)
                lineToRelative(48.4f, 24.2f)
                arcTo(77.57f, 77.57f, 0.0f, false, true, 198.0f, 204.5f)
                close()
                moveTo(160.0f, 202.0f)
                horizontalLineTo(70.05f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 74.0f, 182.0f)
                horizontalLineToRelative(74.13f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(79.77f)
                arcToRelative(65.85f, 65.85f, 0.0f, false, true, 17.16f, -18.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.1f, -9.67f)
                arcTo(78.27f, 78.27f, 0.0f, false, false, 58.0f, 204.5f)
                verticalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(214.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(192.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineTo(42.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(186.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 182.0f, 74.0f)
                horizontalLineTo(107.89f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineToRelative(68.34f)
                arcToRelative(65.85f, 65.85f, 0.0f, false, true, -17.16f, 18.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.1f, 9.67f)
                arcTo(78.27f, 78.27f, 0.0f, false, false, 198.0f, 51.5f)
                verticalLineTo(24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 18.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
