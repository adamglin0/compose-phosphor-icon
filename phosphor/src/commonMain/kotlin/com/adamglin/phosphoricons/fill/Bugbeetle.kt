package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Bugbeetle: ImageVector
    get() {
        if (_bugbeetle != null) {
            return _bugbeetle!!
        }
        _bugbeetle = Builder(name = "Bugbeetle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 120.0f)
                lineTo(208.0f, 120.0f)
                lineTo(208.0f, 104.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(32.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(48.0f, 120.0f)
                lineTo(48.0f, 104.0f)
                close()
                moveTo(208.0f, 160.0f)
                curveToRelative(0.0f, 2.7f, -0.14f, 5.37f, -0.4f, 8.0f)
                lineTo(224.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(204.32f, 184.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -152.64f, 0.0f)
                lineTo(32.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(48.4f, 168.0f)
                curveToRelative(-0.26f, -2.63f, -0.4f, -5.3f, -0.4f, -8.0f)
                verticalLineToRelative(-8.0f)
                lineTo(32.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(48.0f, 136.0f)
                lineTo(48.0f, 120.0f)
                lineTo(208.0f, 120.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(208.0f, 152.0f)
                close()
                moveTo(136.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(69.84f, 57.15f)
                arcTo(79.76f, 79.76f, 0.0f, false, false, 48.4f, 104.0f)
                lineTo(207.6f, 104.0f)
                arcToRelative(79.76f, 79.76f, 0.0f, false, false, -21.44f, -46.85f)
                lineToRelative(19.5f, -19.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineToRelative(-20.29f, 20.3f)
                arcToRelative(79.74f, 79.74f, 0.0f, false, false, -92.1f, 0.0f)
                lineTo(61.66f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 50.34f, 37.66f)
                close()
            }
        }
        .build()
        return _bugbeetle!!
    }

private var _bugbeetle: ImageVector? = null
