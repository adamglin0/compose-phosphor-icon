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

public val BoldGroup.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) {
            return _bugBeetle!!
        }
        _bugBeetle = Builder(name = "BugBeetle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(212.0f, 136.0f)
                lineTo(212.0f, 120.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(210.45f, 96.0f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, false, -18.78f, -38.7f)
                lineToRelative(16.82f, -16.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineToRelative(-18.0f, 18.0f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, false, -91.1f, 0.0f)
                lineToRelative(-18.0f, -18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(64.33f, 57.3f)
                arcTo(83.7f, 83.7f, 0.0f, false, false, 45.55f, 96.0f)
                lineTo(32.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.0f, 120.0f)
                verticalLineToRelative(16.0f)
                lineTo(32.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.0f, 160.0f)
                arcToRelative(83.55f, 83.55f, 0.0f, false, false, 1.55f, 16.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(54.15f, 200.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 147.7f, 0.0f)
                lineTo(224.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(210.45f, 176.0f)
                arcTo(83.55f, 83.55f, 0.0f, false, false, 212.0f, 160.0f)
                close()
                moveTo(128.0f, 52.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, 57.82f, 44.0f)
                lineTo(70.18f, 96.0f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 128.0f, 52.0f)
                close()
                moveTo(140.0f, 218.79f)
                lineTo(140.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(70.79f)
                arcTo(60.09f, 60.09f, 0.0f, false, true, 68.0f, 160.0f)
                lineTo(68.0f, 120.0f)
                lineTo(188.0f, 120.0f)
                verticalLineToRelative(40.0f)
                arcTo(60.09f, 60.09f, 0.0f, false, true, 140.0f, 218.79f)
                close()
            }
        }
        .build()
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
